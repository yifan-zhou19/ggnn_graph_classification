package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String str = new String(new char[101]);
	 int[] a = new int[101];
	 int[] sh = new int[100];
	 int i1;
	 int i2;
	 int i3;
	 int i4;
	 int i5;
	 int len;
	 int yu = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 str = tempVar.charAt(0);
	 }
	 len = str.length();
	 for (i1 = 0;i1 <= len - 1;i1++)
	 {
	  a[i1] = str.charAt(i1) - '0';
	 }
	 for (i2 = 0;i2 <= len - 1;i2++)
	 {
	  sh[i2] = (a[i2] + yu * 10) / 13;
	  yu = (a[i2] + yu * 10) % 13;
	 }
	// printf("%d",yu);
	 if (len == 1)
	 {
	 System.out.printf("%d\n%d\n",0,a[0]);
	 }
	 else if ((len == 2) && (a[0] == 1) && (a[1] <= 2))
	 {
	 System.out.printf("%d\n%d%d\n",0,a[0],a[1]);
	 }
	 else
	 {
		if (a[1] == 0)
		{
		 for (i4 = 2;i4 <= len - 1;i4++)
		 {
		   if (i4 == (len - 1))
		   {
		   System.out.printf("%d\n",sh[i4]);
		   }
		   else
		   {
		   System.out.printf("%d",sh[i4]);
		   }
		 }
		}
	  else
	  {
		 for (i5 = 1;i5 <= len - 1;i5++)
		 {
		   if (i5 == (len - 1))
		   {
		   System.out.printf("%d\n",sh[i5]);
		   }
		   else
		   {
		   System.out.printf("%d",sh[i5]);
		   }
		 }
	  }
	 System.out.printf("%d",yu);
	 }

	}


}

