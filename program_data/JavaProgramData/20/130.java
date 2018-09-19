package <missing>;

public class GlobalMembers
{
	/*void InsertSort(int[],int);
	void InsertSort(int pData[],int Count)
	{
	int iTemp;
	int iPos;
	int i;
	for(i=1;i<Count;i++)
	              {
	               iTemp = pData[i];
	               iPos = i-1;
	               while((iPos>=0) && (iTemp<pData[iPos]))
	                               {
	                                 pData[iPos+1] = pData[iPos];
	                                 iPos--;
	                               }
	               pData[iPos+1] = iTemp;
	             }
	} */
	public static void Main()
	{
		int i = 0;
		int j;
		int k;
		int m;
		int[] max = new int[100];
		char[][] str = new char[100][100];
		char[][] substr = new char[100][100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(max,0,(Integer.SIZE / Byte.SIZE) * 100);
		while (scanf("%s %s", str[i], substr[i]) != EOF)
		{
		i++;
		}
		for (j = 0;j < i;j++)
		{
			for (k = 0;k < String.valueOf(str[j]).length();k++)
			{
				if (str[j][k] > str[j][max[j]])
				{
					max[j] = k;
				}
			}
		}
		for (j = 0;j < i;j++)
		{
			k = 0;
			while (k <= max[j])
			{
				System.out.print(str[j][k]),k++;
			}
			for (m = 0;m < String.valueOf(substr[j]).length();m++)
			{
				System.out.print(substr[j][m]);
			}
			while (k < String.valueOf(str[j]).length())
			{
				System.out.print(str[j][k]),k++;
			}
		System.out.print('\n');
		}
	}
}
