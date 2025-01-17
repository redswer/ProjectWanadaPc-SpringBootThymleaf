package com.wanada.mapper;

import java.util.HashMap;
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
	//전체 제품 조회
	List<ProductDTO> getAllProducts();
	// 필터링된 제품 조회
	List<ProductDTO> getFilteredProducts(@Param("COMPUTER_CPU") List<String> COMPUTER_CPU,
			@Param("COMPUTER_COOLER") List<String> COMPUTER_COOLER, @Param("COMPUTER_GPU") List<String> COMPUTER_GPU,
			@Param("COMPUTER_HDD") List<String> COMPUTER_HDD,
			@Param("COMPUTER_MAINBOARD") List<String> COMPUTER_MAINBOARD,
			@Param("COMPUTER_POWER") List<String> COMPUTER_POWER, @Param("COMPUTER_RAM") List<String> COMPUTER_RAM,
			@Param("COMPUTER_SSD") List<String> COMPUTER_SSD, @Param("COMPUTER_CASE") List<String> COMPUTER_CASE);
	//각 제품 페이지
	List<CpuDTO> getComputerCpuProducts();
	List<CaseDTO> getComputerCaseProducts();
	List<CoolerDTO> getComputerCoolerProducts();
	List<GpuDTO> getComputerGpuProducts();
	List<HddDTO> getComputerHddProducts();
	List<MainBoardDTO>getComputerMBProducts();
	List<PowerDTO>getComputerPowerProducts();
	List<RamDTO>getComputerRamProducts();
	List<SsdDTO>getComputerSsdProducts();
	//각각 제품 상세 설명 페이지
	public CpuDTO getComputerCpuProductsAll(String CPU_NAME);
	public CaseDTO getComputerCaseProductsAll(String CASE_NAME);
	public CoolerDTO getComputerCoolerProductsAll(String COOLER_NAME);
	public GpuDTO getComputerGpuProductsAll(String GPU_NAME);
	public HddDTO getComputerHddProductsAll(String HDD_NAME);
	public MainBoardDTO getComputerMbProductsAll(String MB_NAME);
	public PowerDTO getComputerPowerProductsAll(String POWER_NAME);
	public RamDTO getComputerRamProductsAll(String RAM_NAME);
	public SsdDTO getComputerSsdProductsAll(String SSD_NAME);
	
	
}
