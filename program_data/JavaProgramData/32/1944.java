package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int[] a1 = new int[101];
		int[] b1 = new int[101];
		int[] c = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int length1;
		int length2;
		int length;
		for (j = 1;j <= n;j++)
		{
		   for (i = 0;i <= 100;i++)
		   {
			   a1[i] = b1[i] = c[i] = 0;
		   }
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			 length1 = a.length();
			 length2 = b.length();
			if (length1 > length2)
			{
				 length = length1;
			}
			 else
			 {
				 length = length2;
			 }
			 for (i = 0;i < length1;i++)
			 {
				 a1[i] = a.charAt(length1 - i - 1) - '0';
			 }
			 for (i = 0;i < length2;i++)
			 {
				 b1[i] = b.charAt(length2 - i - 1) - '0';
			 }
			  for (i = 0;i < length;i++)
			  {
				 c[i] += a1[i] - b1[i];
				 while (c[i] < 0)
				 {
					 c[i] = c[i] + 10;
					 c[i + 1]--;
				 }
			  }
			 for (i = 0;i < length;i++)
			 {
				 System.out.printf("%d",c[length - i - 1]);
			 }
			 System.out.print("\n");
		}
		return 0;
	}


}

