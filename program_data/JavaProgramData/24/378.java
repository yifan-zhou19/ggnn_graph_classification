package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[50][50];
		int min;
		int[] b = new int[50];
		int i = 0;
		int max = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int j;
		while (scanf("%s",a[i]) != EOF)
		{
			b[i] = String.valueOf(a[i]).length();
			i++;
		}
		for (j = 0,min = b[0];j < i;j++)
		{
			if (b[j] > max)
			{
				max = b[j];
			}
			if (b[j] < min)
			{
				min = b[j];
			}
		}
		for (j = 0;j < i;j++)
		{
			if (b[j] == max)
			{
				System.out.printf("%s\n",a[j]);
				break;
			}
		}
			for (j = 0;j < i;j++)
			{
			if (b[j] == min)
			{
				System.out.printf("%s",a[j]);
				break;
			}
			}
	}


}
