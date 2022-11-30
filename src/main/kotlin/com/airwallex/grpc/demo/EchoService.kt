package com.airwallex.grpc.demo

import com.airwallex.grpc.error.Error
import com.github.michaelbull.result.Ok
import com.github.michaelbull.result.Result
import demo.EchoServiceRpc
import javax.inject.Singleton

@Singleton
class EchoService : EchoServiceRpc {

    override suspend fun echo(request: String): Result<String, Error> {
        return Ok(request)
    }
}
