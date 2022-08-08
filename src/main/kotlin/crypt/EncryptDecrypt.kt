package crypt

import t102COntent
import t104Content
import java.security.SecureRandom
import java.util.*
import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.spec.SecretKeySpec


fun main(args: Array<String>) {

    //t102 conent base64 encoded

    val clientPrivateKeyDecoded = Base64.getDecoder().decode(t102COntent.clientPriKey)
    val aesDecoded = Base64.getDecoder().decode(t104Content.passwordDes)
   val decyptedAesSessionKey= RSAUtil.decrypt(t104Content.passwordDes,t102COntent.clientPriKey)
//    val decyptedAesSessionKey = decrypt(clientPrivateKeyDecoded, aesDecoded)
    print(decyptedAesSessionKey)
}

fun sd() {
    val data = "this is data".toByteArray()
    val keyStart = "this is a key".toByteArray()
    val kgen = KeyGenerator.getInstance("AES")
    val sr: SecureRandom = SecureRandom.getInstance("SHA1PRNG")
    sr.setSeed(keyStart)
    kgen.init(128, sr) // 192 and 256 bits may not be available
    val skey = kgen.generateKey()
    val key = skey.encoded
    val encryptedData = encrypt(key, data)
    val decryptedData: ByteArray = decrypt(key, encryptedData)
    print(String(decryptedData))
}

@Throws(Exception::class)
private fun encrypt(key: ByteArray, clear: ByteArray): ByteArray {
    val skeySpec = SecretKeySpec(key, "AES")
    val cipher = Cipher.getInstance("AES")
    cipher.init(Cipher.ENCRYPT_MODE, skeySpec)
    return cipher.doFinal(clear)
}

@Throws(Exception::class)
private fun decrypt(key: ByteArray, encrypted: ByteArray): ByteArray {
    val skeySpec = SecretKeySpec(key, "AES")
    val cipher = Cipher.getInstance("AES")
    cipher.init(Cipher.DECRYPT_MODE, skeySpec)
    return cipher.doFinal(encrypted)
}

