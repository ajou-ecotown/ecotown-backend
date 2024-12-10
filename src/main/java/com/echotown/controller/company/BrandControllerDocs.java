package com.echotown.controller.company;

import com.echotown.dto.BrandInfoResponse;
import com.echotown.dto.ProductInfoOfBrandMap;
import com.echotown.dto.ProductInfoResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import java.util.Map;

@Tag(name = "Company", description = "기업 관련 API")
public interface BrandControllerDocs {

    @Operation(summary = "친환경기업 리스트 조회", description = "친환경기업 리스트를 조회합니다.")
    @ApiResponse(responseCode = "200", description = "친환경기업 리스트 조회 성공", useReturnTypeSchema = true)
    List<BrandInfoResponse> getBrands();

    @Operation(summary = "친환경기업의 상품 조회", description = "친환경기업의 상품을 조회합니다.")
    @ApiResponse(responseCode = "200", description = "친환경기업의 상품 조회 성공", useReturnTypeSchema = true)
    Map<String, List<ProductInfoResponse>> getProducts();


}


/* POST '/signup'
{
	user_id: 'user_id',
	username: 'username',
	email: 'email',
	password: 'password'
}
 */

/*
POST '/login'
{ user_id: 'user_id', password: 'password' }

성공 시 200, 반환 값
{ user_id: 'user_id', username: 'username' }

실패 시 404, 반환 값 {}
 */