package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[5];
	  int i;
	  int j;
	  int t;
	  String c = new String(new char[5]);
	  char d;
	  c = tangible.StringFunctions.changeCharacter(c, 1, 'z');
	  c = tangible.StringFunctions.changeCharacter(c, 2, 'q');
	  c = tangible.StringFunctions.changeCharacter(c, 3, 's');
	  c = tangible.StringFunctions.changeCharacter(c, 4, 'l');
	  for (a[2] = 4;a[2] < 6;a[2]++)
	  {
		 for (a[1] = 1;a[1] < a[2] - 1;a[1]++)
		 {
			 for (a[3] = 1;a[3] < a[2] - a[1];a[3]++)
			 {
				 c = tangible.StringFunctions.changeCharacter(c, 1, 'z');
				 c = tangible.StringFunctions.changeCharacter(c, 2, 'q');
				 c = tangible.StringFunctions.changeCharacter(c, 3, 's');
				 c = tangible.StringFunctions.changeCharacter(c, 4, 'l');
			   if (a[3] == a[1])
			   {
				   continue;
			   }
			   else
			   {
				   a[4] = a[1] + a[2] - a[3];

				 if (a[4] == a[2] || a[4] == a[3] || a[4] == a[1])
				 {
					 continue;
				 }
				 else if (a[1] + a[4] > a[2] + a[3] && a[4] > 0 && a[4] < 6)
				 {
					for (i = 1;i < 4;i++)
					{
						for (j = 4;j > i;j--)
						{
						   if (a[i] < a[j])
						   {
						   t = a[i];
						   a[i] = a[j];
						   a[j] = t;
						   d = c.charAt(i);
						   c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(j));
						   c = tangible.StringFunctions.changeCharacter(c, j, d);
						   }
						}
					}
				 for (i = 1;i < 5;i++)
				 {
				 System.out.print(c.charAt(i));
				 System.out.print(' ');
				 System.out.print(a[i] * 10);
				 System.out.print("\n");

				 }
				 }



			   }
			 }
		 }
		 break;
	  } //??????????break?????????l,q,z,s???

	return 0;

	}
}

