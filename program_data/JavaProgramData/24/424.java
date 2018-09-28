package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   char[][] a = new char[50][100];
	   String max = new String(new char[100]);
	   String min = new String(new char[100]);
	int i;
	int n;
	   for (i = 0;i < 50;i++)
	   {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a[i] = tempVar.charAt(0);
		 }
	   }
	   n = i;
	   max = a[0];
	   min = a[0];
	   for (i = 0;i < n;i++)
	   {
		if (String.valueOf(a[i]).length() == 0)
		{
			break;
		}
		if (max.length() < String.valueOf(a[i]).length())
		{
			max = a[i];
		}
	   if (min.length() > String.valueOf(a[i]).length())
	   {
		   min = a[i];
	   }
	   }
	  System.out.printf("%s\n%s\n",max,min);
	}

}

