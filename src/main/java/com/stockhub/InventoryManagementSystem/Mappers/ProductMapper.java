package com.stockhub.InventoryManagementSystem.Mappers;

import com.stockhub.InventoryManagementSystem.Enities.Product;
import com.stockhub.InventoryManagementSystem.dto.productDTO.Request.CreateProductRequestDto;
import com.stockhub.InventoryManagementSystem.dto.productDTO.Response.ProductResponseDTO;

public class ProductMapper {

    Product product;

    //    Convert Entity to DTO
// after saving a product from Admin to the database
    public static ProductResponseDTO toResponseDto(Product product) {


        return new ProductResponseDTO(
                product.getProductName(),
                product.getId(),
                product.getCategoryId(),
                product.getDateCreated()
        );

    }


//    Convert DTO to Entity

    //    categoryId and totalPrice will be functionalized here in the service area
//    admin can only add the product
    public static Product toEntity(CreateProductRequestDto dto) {
        return new Product(
                dto.getName(),
                dto.getCategoryId(),
                dto.getAvailableQuantity(),
                dto.getTotalPrice(),
                dto.getUnitPrice(),
                dto.getDateCreated()
        );

    }

}
