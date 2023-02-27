package com.alipay.config;

public class AlipayConfig {
	// 商户appid
	public static String APPID = "2021000122615841";
	// 私钥 pkcs8格式的
	public static String RSA_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCUezrX2yYsBOLRDdqr4m/1PMFcuxAUa2NJCrZgwfG62VOd1XLdDqpDORZQYUaSUWHmn7xNIDle3FgWHmv23Qg25cd0/zi3g2N1K/pVvNjod1qHw8jb38MQNHrkDvOwpLUdmCbIYT7OqD/Fr/U8S4lWXe59S0lEqdlAQ6sO8mR/kemBRh4PGgephlRk9oU9EiX4NDOD4ZSBDx2FRd4r6UQnM3NYsrnSa1n9p7KSibyTBZrUW5YGMPd7/lCaagmnv8AgjrdozpbVuLskas0GIbqy0xBlJjRF/gM8Oz0dhls1Jw6H3YcFRjVnkYYlZl9pcl/1KA/Ph+N5PIzv7mDmgopbAgMBAAECggEALWOmT0oc1yP/OizkBdtIok0aRwCgH73cMf3mVpmzDY1V9E/FtzG+dqJC4ft6mUvrg5ac9268WvU8sDZIhsR2uGFxoaBLdD3j73OsKP17yUSDFjGRezVh6dhBIOo5MGyJOSzD3klr67yfEg2CCBaHOzGnsAGNukG5ud11szIB6sT2ChwuhMyCWM7tKa0nMRaOeG5etWC6bcR+RP6Eljz8x2Hw0mjwgj3lqULMTAZ7BB7xJfYu/JjUNG3/qtXa2DvgeGvwP5FFLU3nP4kJX+Th2lGJyaffrsN94+LBNnOx+PPsSAEPEns7YeyOBUnhooovhMyFzNBMunE5NXjif887kQKBgQDaMREzCiGGssLh3g8Vu2dX2l1QLTH9gXucS7TBmH21RQQjTEbqP41ocx6iEPXCyPdB75CWRm2t6rt5DWEiGz7829sD/9I1vQ9arXNXS/ykL27TW4Y2ZU1yEtVccEB7G1724UwFdXcdaO+1lYHsZiIIQGXRCE/knWp7Zan9hVSGTQKBgQCuNdRbezUvmb80kfdLi5ynByj2DJrKDdMw9VIevQ6lplJ51DmuxQD1DZvuTQyj9nLErgIcxXbc750BGGAOcd0kBYvmlKSBn1s+TYKhFa9nOyalUZIsj7Yn01c+yUV2CGEBzP0CPrBGNjFd1zjTQOhNFmjq2+SIn+Qdq6sZsPH3RwKBgQCfjmQqc80iiFTVASL83GdtKkU0nWhCHs76863CKLY8ubSV73CoWkMZT53mHArsHzQZJowQKH6KQO5JToxqeYwtMsVNfmUFYTT6NX70JqAgnIMp0nMqEhh5Q+Z8y6WLoO9oEEccctLhUdyBaExzSBi4+ga6vp5V6vt0M1sFBtxRvQKBgQChDrkWHlEsgbqo8m2rVRZtwQvYdgzA0ok2UQcrzeN1t8+2PENb1VwuMffAF1GhYF34gVsImHJsjcYcVhmwIQqum8YcVb3E7LvhXK1xGWhBSwlOe5xlQDPKm/Oj41YpalOs44PhiG1VbBK1zB0ICZD6e8ZhowukWBYAbE5SASmiTwKBgDpSJpJ05iksac0sDFBIwnoih6K23RZVFfQH0bovoHOlPCcImJF3aRUWbvlnWsV2s/pcKyJo+ZqBU8Jo+Sv6ByfVUO6w/N6zvjVTMXcYJmGoH2erPAW1TJtM28+dFVcDmtwvYHx8G4NZEuUP0Dch5hLHm2gdsKtl/kv+QGq9EG1c";
	// 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://xupxff.natappfree.cc/alipayDemo/notify_url.jsp";
	// 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
	public static String return_url = "http://xupxff.natappfree.cc/alipayDemo/return_url.jsp";
	// 请求网关地址
//	public static String URL = "https://openapi.alipay.com/gateway.do";
	public static String URL = "https://openapi.alipaydev.com/gateway.do";
	// 编码
	public static String CHARSET = "UTF-8";
	// 返回格式
	public static String FORMAT = "json";
	// 支付宝公钥
	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhBm1nNib/WsxrGU01S3vl/a5nNTrBr/No0unRZGZdDTvKOl01Xd5xfBdsHGW0qh8NO60i6+jrocHkMHAxmtP21cFydSnDXXvv7Dmtj/sjmdT5oZ5s3S+AVk6YTyNblvpo0V1GhmnnWMhFtYfhuV1wejKjuLoV9NfxAzoIv6XX+QsUIY/dnwPYz5iK6cbmcHi8IWYFq5+JpZ6Xo9LOVBR01jyjeKxg7XZvkW/wWgGQQcJLCUgxDgl1CQU5yFrDWTe8KVPSsICyiGo6LrlITr1sNIA5w5y/Ti24R4G0fY/OfTzlN5N65d2p/3XSYUUdlnTu+/GMcrQbYjR5MbC25A5RwIDAQAB";
	//public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjrEVFMOSiNJXaRNKicQuQdsREraftDA9Tua3WNZwcpeXeh8Wrt+V9JilLqSa7N7sVqwpvv8zWChgXhX/A96hEg97Oxe6GKUmzaZRNh0cZZ88vpkn5tlgL4mH/dhSr3Ip00kvM4rHq9PwuT4k7z1DpZAf1eghK8Q5BgxL88d0X07m9X96Ijd0yMkXArzD7jg+noqfbztEKoH3kPMRJC2w4ByVdweWUT2PwrlATpZZtYLmtDvUKG/sOkNAIKEMg3Rut1oKWpjyYanzDgS7Cg3awr1KPTl9rHCazk15aNYowmYtVabKwbGVToCAGK+qQ1gT3ELhkGnf3+h53fukNqRH+wIDAQAB";
	// 日志记录目录
	public static String log_path = "/log";
	// RSA2
	public static String SIGNTYPE = "RSA2";
}
