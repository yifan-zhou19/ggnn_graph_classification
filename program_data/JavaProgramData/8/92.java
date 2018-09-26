package <missing>;

public class GlobalMembers
{
	public static void sort1(int[] str1, int m) //????void sort1(int str1,int m)?,????????????:
	{
							  //C:\Program Files\Microsoft Visual Studio\MyProjects\test1\test1.c(10) : error C2109: subscript requires array or pointer type
		int t; //??????????????
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m - i - 1;j++) //????????
			{
				if (str1[j] > str1[j + 1])
				{
					t = str1[j];
					str1[j] = str1[j + 1];
					str1[j + 1] = t;
				}
			}
		}
				//return (str1[30]);//??????????????????
	}
	public static void sort2(int[] str2, int n)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (str2[j] > str2[j + 1])
				{
					t = str2[j];
					str2[j] = str2[j + 1];
					str2[j + 1] = t;
				}
			}
		}
	}
	public static void order(int[] str1, int[] str2, int m, int n)
	{
	  int i; //???????????
	  //????????????????????????????????????
	  //???strcat(str1,str2);?strcat??????????????,???????????.
	  for (i = m;i < m + n;i++)
	  {
		  str1[i] = str2[i - m];
	  }
	  for (i = 0;i < m + n - 1;i++)
	  {
		  System.out.printf("%d ",str1[i]);
	  }
	  System.out.printf("%d",str1[m + n - 1]);
	}
	public static void Main()
	{
		int[] str1 = new int[30];
		int[] str2 = new int[30];
		int i;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str1[i] = Integer.parseInt(tempVar3);
			}
		}
	   for (i = 0;i < n;i++)
	   {
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				str2[i] = Integer.parseInt(tempVar4);
			}
	   }
		sort1(str1, m); //???????????????????(????).
		sort2(str2, n);
		order(str1, str2, m, n);
		System.out.print("\n");
	}

}

