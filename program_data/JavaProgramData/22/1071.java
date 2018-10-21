package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[300];
		int[] c = new int[300];
		int max = 0;
		int j = 0;
		String b = new String(new char[300]);
		for (i = 0;;i++)
		{
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i] = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar2 != null)
		  {
			  b = tangible.StringFunctions.changeCharacter(b, i, tempVar2);
		  }
		  if (b.charAt(i) != ',')
		  {
			  break;
		  }
		}
		n = i + 1;
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
		   for (i = 0;i < n;i++)
		   {
				 if (a[i] > max)
				 {
					 max = a[i];
				 }
		   }
		   for (i = 0;i < n;i++)
		   {
			   if (a[i] < max)
			   {
				   c[j] = a[i];
				   j++;
			   }
		   }
		   if (j == 0)
		   {
			   System.out.print("No");
		   }
		   else
		   {
			   max = 0;
			   for (i = 0;i < j;i++)
			   {
				   if (c[i] > max)
				   {
					   max = c[i];
				   }
			   }
			   System.out.printf("%d",max);
		   }
		}
		return 0;
	}
}

