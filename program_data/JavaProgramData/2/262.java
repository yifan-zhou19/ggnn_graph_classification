package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int j;
		 int k;
		 int t;
		 int m;
		 int[] c = new int[26];
		 int max = 0;
		 final String b = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	 struct book
	//	{
	//	   int num;
	//	   char man[26];
	//	}
	//	a[999];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i].num = tempVar2;
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  a[i].man = tempVar3;
			  }
		}
		 i = 0;
		 for (i = 0;i < m;i++)
		 {
			  for (j = 0;j < 26;j++)
			  {
				  for (k = 0;k < 26;k++)
				  {
					   if (a[i].man[j] == b.charAt(k))
					   {
							c[k] = c[k] + 1;
					   }
				  }
			  }
		 }
		 i = 0;
		 j = 0;
		 k = 0;
		 for (i = 0;i < 26;i++)
		 {
			  if (c[i] > max)
			  {
				   max = c[i];
				   t = i;
			  }
		 }
		  System.out.printf("%c\n%d\n",b.charAt(t),max);
		  for (j = 0;j < m;j++)
		  {
				for (k = 0;k < 26;k++)
				{
					   if (a[j].man[k] == b.charAt(t))
					   {
					   System.out.printf("%d\n",a[j].num);
					   }
				}
		  }

	}


}

