package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[200];
	 int[] b = new int[200];
	 int n;
	 int count = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int i;
	 for (i = 0; i < n; i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  b[i] = Integer.parseInt(tempVar3);
	  }
	  if (a[i] != b[i])
	  {
	   if (a[i] == 2)
	   {
		if (b[i] == 0)
		{
		  count++;
		}
	   else
	   {
		   count--;
	   }
	   }
	   if (a[i] == 1)
	   {
		if (b[i] == 2)
		{
		  count++;
		}
		else
		{
		   count--;
		}
	   }
	   if (a[i] == 0)
	   {
		if (b[i] == 1)
		{
		  count++;
		}
		else
		{
		   count--;
		}
	   }
	  }
	 }
	 if (count > 0)
	 {
		System.out.print("A\n");
	 }
	 if (count < 0)
	 {
		System.out.print("B");
	 }
	 if (count == 0)
	 {
		System.out.print("Tie");
	 }

	}

}

