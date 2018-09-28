package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int b;
	   int i;
	   int j;
	   int k;
	   int l;
	   int z;
	   int length;
	   int sum10;
	   int zhi;
	   i = 0;
	   j = 0;
	   k = 1;
	   l = 0;
	   z = 0;
	   length = 0;
	   sum10 = 0;
	   zhi = 0;
	   String n = new String(new char[50]);
	   String r = new String(new char[50]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   n = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   b = Integer.parseInt(tempVar3);
	   }
	   int[][] m = new int[50][2];
	   int[][] o = new int[50][2];
	   int[] n2 = new int[50];
	   length = n.length();


	  for (i = 0;i < length;i++)
	  {
		  if (n.charAt(i) <= '9')
		  {
		  n2[i] = n.charAt(i) - '0';
		  }
		  else if (n.charAt(i) < 'a' && n.charAt(i)>'9')
		  {
		  n2[i] = n.charAt(i) - 'A' + 10;
		  }
		  else
		  {
		  n2[i] = n.charAt(i) - 'a' + 10;
		  }

	  }


	   for (i = 0;i < length;i++)
	   {
		 m[i][0] = n2[i];
		 m[i][1] = length - i - 1;
		 zhi = m[i][0];
		 for (j = 1;j <= m[i][1];j++)
		 {
			 zhi = zhi * a;
		 }
		 sum10 = sum10 + zhi;
		 zhi = 0;
	   }

	   if (sum10 == 0)
	   {
	   System.out.print("0");
	   }
	   else
	   {
	   k = sum10;

	   while (k != 0)
	   {
		  o[l][0] = k % b;
		  k = k / b;
		  o[l][1] = l;
		  l++;
	   }

	   length = l;

	   for (i = 0;i < length;i++)
	   {
		  if (o[l - i - 1][0] <= 9)
		  {
		  r = tangible.StringFunctions.changeCharacter(r, i, 48 + o[l - i - 1][0]);
		  }
		  else
		  {
		  r = tangible.StringFunctions.changeCharacter(r, i, o[l - i - 1][0] - 10 + 65);
		  }
	   }
		r = tangible.StringFunctions.changeCharacter(r, length, '\0');
		//printf("%s",r);
		System.out.println(r);
	   }
		System.in.read();
		System.in.read();

	}
}

