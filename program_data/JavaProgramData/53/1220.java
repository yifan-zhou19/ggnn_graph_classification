package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[] shuzu = new int[300];
	 int i;
	 int j;

	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  shuzu[i] = Integer.parseInt(tempVar2);
	  }
	 }

		int[] zhuanhuan = new int[300];
	 zhuanhuan[0] = shuzu[0];
	 System.out.printf("%d",zhuanhuan[0]);

	 int a = 1;
	 int b;


	 for (i = 1;i < n;i++)
	 {
	  b = 0;
	  for (j = 0;j < a;j++)
	  {
	   if (shuzu[i] == zhuanhuan[j])
	   {
		break;
	   }
	   else
	   {
					b++;

	   }
	   if (b == a)
	   {
		zhuanhuan[a] = shuzu[i];
		System.out.printf(",%d",shuzu[i]);
		a++;
	   }
	  }

	 }

	 return 0;
	}

}

