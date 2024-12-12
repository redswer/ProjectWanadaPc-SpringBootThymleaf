package com.wanada.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wanada.dto.CaseDTO;
import com.wanada.dto.CoolerDTO;
import com.wanada.dto.CpuDTO;
import com.wanada.dto.GpuDTO;
import com.wanada.dto.HddDTO;
import com.wanada.dto.MainBoardDTO;
import com.wanada.dto.PowerDTO;
import com.wanada.dto.ProductDTO;
import com.wanada.dto.RamDTO;
import com.wanada.dto.SsdDTO;

@Mapper
public interface ProductMapper {
	List<ProductDTO> getAllProducts();
	// 필터링된 제품 조회
	List<ProductDTO> getFilteredProducts(@Param("COMPUTER_CPU") List<String> COMPUTER_CPU,
			@Param("COMPUTER_COOLER") List<String> COMPUTER_COOLER, @Param("COMPUTER_GPU") List<String> COMPUTER_GPU,
			@Param("COMPUTER_HDD") List<String> COMPUTER_HDD,
			@Param("COMPUTER_MAINBOARD") List<String> COMPUTER_MAINBOARD,
			@Param("COMPUTER_POWER") List<String> COMPUTER_POWER, @Param("COMPUTER_RAM") List<String> COMPUTER_RAM,
			@Param("COMPUTER_SSD") List<String> COMPUTER_SSD, @Param("COMPUTER_CASE") List<String> COMPUTER_CASE);

	List<CpuDTO> getComputerCpuProducts();
	List<CaseDTO> getComputerCaseProducts();
	List<CoolerDTO> getComputerCoolerProducts();
	List<GpuDTO> getComputerGpuProducts();
	List<HddDTO> getComputerHddProducts();
	List<MainBoardDTO>getComputerMBProducts();
	List<PowerDTO>getComputerPowerProducts();
	List<RamDTO>getComputerRamProducts();
	List<SsdDTO>getComputerSsdProducts();
	
}
