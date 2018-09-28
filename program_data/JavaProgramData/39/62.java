package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
		int h;
		int k;
		int total;
	  char[][] a = new char[100][21];
	  String d = new String(new char[100]);
	  String e = new String(new char[100]);
	  int[] b = new int[100];
	  int[] c = new int[100];
	  int[] f = new int[100];
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
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   b[i] = Integer.parseInt(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead(" ");
	   if (tempVar4 != null)
	   {
		   c[i] = Integer.parseInt(tempVar4);
	   }
	   String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar5 != null)
	   {
		   d = tangible.StringFunctions.changeCharacter(d, i, tempVar5);
	   }
	   String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar6 != null)
	   {
		   e = tangible.StringFunctions.changeCharacter(e, i, tempVar6);
	   }
	   String tempVar7 = ConsoleInput.scanfRead(" ");
	   if (tempVar7 != null)
	   {
		   f[i] = Integer.parseInt(tempVar7);
	   }
	  }
		k = 0;
		total = 0;
	  for (i = 0;i <= n - 1;i++)
	  {
		  s = 0;
		if (b[i] > 80 && f[i] >= 1)
		{
			s = s + 8000;
		}
		if (b[i] > 85 && c[i] > 80)
		{
			s += 4000;
		}
		if (b[i] > 90)
		{
			s += 2000;
		}
		if (b[i] > 85 && e.charAt(i) == 'Y')
		{
			s += 1000;
		}
		if (c[i] > 80 && d.charAt(i) == 'Y')
		{
			s += 850;
		}
		if (s > k)
		{
			k = s;
			h = i;
		}
		total += s;
	  }
	  System.out.println(a[h]);
	  System.out.printf("%d\n%d",k,total);
	return 0;
	}
}

