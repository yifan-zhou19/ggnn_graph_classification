package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //p???????????1
		int j;
		int k;
		int l;
		int p = 0;
		int[] a = new int[5];
		int h;
		String b = new String(new char[5]);
		char c;
		for (i = 1;i < 6;i++)
		{
		   for (j = 1;j < 6;j++)
		   {
			  if (j == i)
			  {
				  continue; //?????????
			  }
			  else
			  {
				  for (k = 1;k < 6;k++)
				  {
					  if (k == j || k == i)
					  {
						  continue; //?????????
					  }
					  else
					  {
						for (l = 1;l < 6;l++)
						{
						if (l != i && l != j && l != k && i + j == k + l && i + l > j + k && i + k < j)
						{
									 p = 1;
									 break; //???????p??1?????
						}
						}
					  }
					  if (p == 1)
					  {
						  break; //p??1?????
					  }
				  }
			  }
			  if (p == 1)
			  {
				  break; //p??1?????
			  }
		   }
		   if (p == 1)
		   {
			   break; //p??1?????
		   }
		}
		a[1] = i;
		a[2] = j;
		a[3] = k;
		a[4] = l;
		b = tangible.StringFunctions.changeCharacter(b, 1, 'z');
		b = tangible.StringFunctions.changeCharacter(b, 2, 'q');
		b = tangible.StringFunctions.changeCharacter(b, 3, 's');
		b = tangible.StringFunctions.changeCharacter(b, 4, 'l');
		for (i = 1;i < 5;i++)
		{
		   for (j = i + 1;j < 5;j++)
		   {
			  if (a[i] < a[j])
			  {
						h = a[i];
						a[i] = a[j];
						a[j] = h;
						c = b.charAt(i);
						b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
						b = tangible.StringFunctions.changeCharacter(b, j, c);
			  } //??
		   }
		}
		System.out.print(b.charAt(1));
		System.out.print(' ');
		System.out.print(a[1] * 10);
		System.out.print("\n");
		System.out.print(b.charAt(2));
		System.out.print(' ');
		System.out.print(a[2] * 10);
		System.out.print("\n");
		System.out.print(b.charAt(3));
		System.out.print(' ');
		System.out.print(a[3] * 10);
		System.out.print("\n");
		System.out.print(b.charAt(4));
		System.out.print(' ');
		System.out.print(a[4] * 10);
		return 0;
	}

}

