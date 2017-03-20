//
// Created by stylelin on 2017/3/20.
//
#include <ndktest_cg_com_ndktest_NdkUtils.h>
JNIEXPORT jstring JNICALL Java_ndktest_cg_com_ndktest_NdkUtils_getStrinFromC
  (JNIEnv * env, jobject jject){
    return (*env)->NewStringUTF(env,"我靠，终于成功了！");
  }

