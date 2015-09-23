// for Loop

public int fibonacciN (int N){
	
	if(N < 3){ 
		return 1; 
	}
	
	int first = 1;
	int second = 1; 
	int rst = 0; 
	for(int i = 3; i <= N; i++){
		rst = first + second;
		first = second;
		second =rst;
	}
	return rst;
}

// recursive

public int fibonacciN (int N){

	if( N == 1 || N == 2 ){ // stop condition
		return 1;
	}
	return fibonacciN(N-1)+fibonacciN(N-2);
}