int exchange = int [5];
int main()
{
	int[][] matrix = new int[5][5];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * p;
	for (p = matrix[0];p - matrix[0] < 25;p++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
	}
	if (exchange(matrix))
	{
		for (p = matrix[0];p - matrix[0] < 25;p++)
		{
			System.out.printf("%d%c",*p,(p - matrix[0] + 1) % 5?' ':'\n');
		}
	}
	else
	{
		System.out.print("error\n"); //              a=1010110110100001
	}
	return 0; //              b=1110100100011100
} //          a^=b :0100010010111101
int exchange(int matrix[5]) //      b^=a :1010110110100001
{ //                                   a^=b :1110100100011100
	int n;
	int m;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	if (n < 0 || n>4 || m < 0 || m>4)
	{
		return 0;
	}
	else
	{
		int i;
		for (i = 0;i < 5;i++)
		{
			matrix[m][i] ^= matrix[n][i];
			matrix[n][i] ^= matrix[m][i];
			matrix[m][i] ^= matrix[n][i];
		}
		return 1;
	}
}








