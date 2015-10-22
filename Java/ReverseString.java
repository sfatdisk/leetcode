
public String reverse( String input ){
	if( input== null ){ return null ; }
	int len= input.length();
	if( len== 0 ){ return  ""; }
	
	StringBuilder result= new StringBuilder( len );
	for( int i= len-1; i>=0 ; --i ){
		result.append( input.charAt(i) );
	}
	return result.toString();
}

public String reverse( String input ){
	
	return new StringBuilder(input).reverse().toString();
}




