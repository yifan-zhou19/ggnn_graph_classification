package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int z;
	  int q;
	  int s;
	  int l;
	  int a1;
	  int a2;
	  int a3;
	  String name = new String(new char[6]);
	  int[] weight = new int[6];
	  int i = 0;

	  for (i = 0;i < 6;i++)
	  {
		weight[i] = 0;
	  }

	  for (z = 1;z <= 5;z++)
	  {
		  for (q = 1;q <= 5;q++)
		  {
			  for (s = 1;s <= 5;s++)
			  {
				  for (l = 1;l <= 5;l++)
				  {

					  a1 = (z + q) == (s + l);
					  a2 = (z + l) > (s + q);
					  a3 = (z + s) < q;

					  if (a1 != 0 && a2 != 0 && a3 != 0)
					  {
						  name = tangible.StringFunctions.changeCharacter(name, z, 'z');
						  weight[z] = z * 10;
						  name = tangible.StringFunctions.changeCharacter(name, q, 'q');
						  weight[q] = q * 10;
						  name = tangible.StringFunctions.changeCharacter(name, s, 's');
						  weight[s] = s * 10;
						  name = tangible.StringFunctions.changeCharacter(name, l, 'l');
						  weight[l] = l * 10;
					  }
				  }
			  }
		  }
	  }



	  for (i = 5;i >= 0;i--)
	  {
		  if (weight[i] != 0)
		  {
		  System.out.print(name.charAt(i));
		  System.out.print(" ");
		  System.out.print(weight[i]);
		  System.out.print("\n");
		  }
	  }

	return 0;
	}
}

