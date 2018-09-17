package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int t;
		  i = j = k = 0;
		  int[] b = new int[1000];
		  while (k < 1000)
		  {
			  b[k] = 1;
		  k++;
		  }
		  String a = new String(new char[1000]);
		  a = new Scanner(System.in).nextLine();
		  for (k = 0;k < 1000;k++)
		  {
			  if (a.charAt(k) > 'Z')
			  {
				  a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k) - 32);
			  }
		  }
		  while (i < 1000)
		  {
				 j = i;
						 if (a.charAt(j) == '\0')
						 {
						 break;
						 }
						 while (a.charAt(j) == a.charAt(j + 1))
						 {
							 b[j + 1] = b[j] + 1;
							 j++;

						 }
							 System.out.printf("(%c,%d)",a.charAt(j),b[j]);
							 i = j + 1;

		  }

	}
}

