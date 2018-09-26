package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int i;
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 7;i++)
		{
		  if ((n + i) % 7 == 5)
		  {
			n = (1 + i) % 7; //??????
			break;
		  }
		}
		//printf("first Friday=%d\n",n);
		int e = 13;
		for (i = 0;i < 12;i++)
		{
		  e = e + m[i];
		  //printf("%d\n",e);
		  if (e % 7 == n)
		  {
			System.out.printf("%d\n",i + 1);
		  }
		}

		return 0;
	}
}

