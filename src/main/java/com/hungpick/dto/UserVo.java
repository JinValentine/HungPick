package com.hungpick.dto;

public class UserVo {

	private MemberDto memberDto;
	private GifticonDto gifticonDto;
	private GifticonExchangeDto gifticonExchangeDto;
	
	public MemberDto getUserDto() {
		return memberDto;
	}
	public void setUserDto(MemberDto userDto) {
		this.memberDto = userDto;
	}
	public GifticonDto getGifticonDto() {
		return gifticonDto;
	}
	public void setGifticonDto(GifticonDto gifticonDto) {
		this.gifticonDto = gifticonDto;
	}
	public GifticonExchangeDto getGifticonExchangeDto() {
		return gifticonExchangeDto;
	}
	public void setGifticonExchangeDto(GifticonExchangeDto gifticonExchangeDto) {
		this.gifticonExchangeDto = gifticonExchangeDto;
	}
	
	
}
