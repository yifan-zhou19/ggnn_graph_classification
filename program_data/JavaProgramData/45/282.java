package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String a = new String(new char[80]);
	 String b = new String(new char[80]);
	 int la;
	 int lb;
	 int i;
	 int j;
	 int k;
	 int c;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 b = tempVar2.charAt(0);
	 }
	 la = a.length();
	 lb = b.length();
	 for (i = 0;i < lb;i++)
	 {
	  if (b.charAt(i) == a.charAt(0))
	  {
	   for (j = i,k = 0;j < lb,k < la;k++,j++)
	   {
		if (a[k] = b.charAt(j) != null)
		{
			c = c + 1;
		}
		else
		{
			break;
		}
	   }
	   if (c = la)
	   {
		System.out.printf("%d\n",i);
		break;
	   }
	  }
	 }
	}
}

