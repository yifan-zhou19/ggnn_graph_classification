package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int j;
		int i;
		int n;
		int max;
		int count;
		int[] a = new int[100];
		//int order[100];
		char[][] s = new char[100][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  s[i] = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  a[i] = Integer.parseInt(tempVar3);
		  }
		}
		n = 0;
		for (count = 0;count < num;count++)
		{
		   max = 59;
		   for (i = 0;i < num; i++)
		   {
			if (a[i] > max && a[i] < 200) //??????
			{
					max = a[i];
					j = i;
			}
		   }
		   if (max == 59) //??????????????60?????
		   {
			   break;
		   }
		  System.out.printf("%s\n", s[j]); //???s[i][10](?????)??s[i](??????) ???????max
		  a[j] = 300; //??????
		}
		 for (i = 0;i < num; i++)
		 {
			  if (a[i] < 60)
			  {
			  System.out.printf("%s\n", s[i]); //???s[i][10](?????)??s[i](??????)
			  }
		 }
		//getchar();
		//getchar();???vc6.0?????
		return 0;
	}
}

