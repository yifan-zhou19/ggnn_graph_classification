package <missing>;

public class GlobalMembers
{
	public static int count(String[] b, String c, int[] d, int num)
	{
	  int k = 0;
	  while (k < num && strcmp(b[k],c) != 0)
	  {
		  ++k;
	  }
	  if (k < num)
	  {
		d[k]++;
		return num;
	  }
	  else
	  {
		  b[num] = c;
		  d[num] = 1;
		  return num + 1;
	  }
	}
	public static void Main()
	{
	  String a = new String(new char[301]);
	  char[][] b = new char[301][6];
	  String c = new String(new char[6]);
	  int i;
	  int j;
	  int k;
	  int l;
	  int n;
	  int num;
	  int[] d = new int[301];
	  int max;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a = tempVar2.charAt(0);
	 }
	  l = a.length();
	  num = 0;
	  for (i = 0;i <= l - n;++i)
	  {
		for (j = 0;j < n;++j)
		{
		  c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(i + j));
		}
		c = tangible.StringFunctions.changeCharacter(c, j, '\0');
		num = count(b, c, d, num);
	  }
	  max = d[0];
	   for (i = 0;i < num;i++)
	   {
		   if (d[i] >= max)
		   {
			   max = d[i];
		   }
	   }
	   if (max == 1)
	   {
		   System.out.print("NO");
	   }
	   else
	   {
	   System.out.printf("%d\n",max);
	   for (k = 0;k < l - n;k++)
	   {
		   if (d[k] == max)
		   {
			   System.out.printf("%s\n",b[k]);
		   }
	   }
	   }
	}
}

