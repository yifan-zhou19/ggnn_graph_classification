//???2010?12?1?

//???1000010586_???

//????????

int num;
int make( int M , int N );                   //????make????????????
int work( int M , int j );                   //????work???????????
int main()
{
	int M , N , t , k , i;                             //????
	cin >> t;                                          //?????? 
	for ( i = 1 ; i <= t ; i++ )
	{
		k = 0;                                         //????
		num = 0;                                       //??????
		cin >> M >> N;                                 //??  
		k = make( M , N );                             //??????
		cout << k << endl;                             //??
	}
	return 0;
}
int make( int M , int N )
{
	int j , k;
	if ( M < N )                                       //?M<N? ?????M?????   
	{
	   num = num + 1;                                  //???????? ??????
	   return make( M , M - 1 );                  //???????????
	}
	else
	{
        for ( j = N ; j >= 1 ; j-- )                    //???1?  ?????????N????? 
		{
		    num = work( M , j );
		}
		return num;
	}
}
int work( int M , int j )
{
	if ( j == 1 )                                       //???????  ??1???
	{
		num = num + 1;                                  //???1  ??
		return num;
	}
	else
		return make ( M - j , j );                //??????1  ???M-N????j????????????
}
  
