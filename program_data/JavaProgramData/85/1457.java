package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int c;
	 int g;
	 char[][] a = new char[20][21];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i <= n - 1;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = tempVar2.charAt(0);
	  }
	 }
	 for (c = 0;c <= n - 1;c++)
	 {
	   if ((a[c][0] < 65) || (a[c][0]>90 && a[c][0] < 95) || (a[c][0] == 96) || (a[c][0]>122))
	   {
		 System.out.println("no");
		 continue;
	   }
		else
		{
	   for (g = 0;g < String.valueOf(a[c]).length();g++)
	   {
		if ((a[c][g] < 48) || (a[c][g]>57 && a[c][g] < 65) || (a[c][g]>90 && a[c][g] < 95) || (a[c][g] == 96) || (a[c][g]>122))
		{
		System.out.println("no");
		break;
		}
		if ((g == String.valueOf(a[c]).length() - 1) && ((a[c][g] == 95) || (a[c][g] >= 65 && a[c][g] <= 90) || (a[c][g] >= 97 && a[c][g] <= 122) || (a[c][g] >= 48 && a[c][g] <= 57)))
		{
		System.out.println("yes");
		}
	   }
		}
	 }
	 return 0;
	}
}

