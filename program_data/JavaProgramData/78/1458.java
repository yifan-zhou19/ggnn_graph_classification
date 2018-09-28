package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] a = new int[4];
		int i;
		int j;
		int k;
		String b = new String(new char[4]); //k,h??????i,j?????
		char h;
		for (z = 1;z <= 5;z++)
		{
		 for (q = 1;q <= 5;q++)
		 {
		  for (s = 1;s <= 5;s++)
		  {
		   for (l = 1;l <= 5;l++) //??????????
		   {
			if ((z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q) //????????
			{
			 a[0] = z * 10;
			 b = tangible.StringFunctions.changeCharacter(b, 0, 'z');
			 a[1] = q * 10;
			 b = tangible.StringFunctions.changeCharacter(b, 1, 'q');
			 a[2] = s * 10;
			 b = tangible.StringFunctions.changeCharacter(b, 2, 's');
			 a[3] = l * 10;
			 b = tangible.StringFunctions.changeCharacter(b, 3, 'l');
			} //???????????????
		   }
		  }
		 }
		}
		for (i = 0;i < 3;i++)
		{
		 for (j = 0;j < 3 - i;j++)
		 {
		  if (a[j] < a[j + 1])
		  {
			   k = a[j];
			a[j] = a[j + 1];
			a[j + 1] = k;
			h = b.charAt(j);
			b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
			b = tangible.StringFunctions.changeCharacter(b, j + 1, h);
		  } //?????????????????????
		 }
		}
	  for (i = 0;i < 4;i++)
	  {
	  System.out.print(b.charAt(i));
	  System.out.print(" ");
	  System.out.print(a[i]);
	  System.out.print("\n");
	  }
	  return 0;
	}
}

