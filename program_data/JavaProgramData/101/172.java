package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i; //??for??,i,j,k????a,b,c?????
	int j;
	int k;
	int l;
	int a; //??????a,b,c?????
	int b;
	int c;
	String out = new String(new char[3]); //out????
	for (i = 1;i <= 3;i++)
	{
	  for (j = 1;j <= 3;j++)
	  {
		if (i != j) //??????
		{
		   k = 6 - i - j;
		   a = (j > i) + (k == i); //????a,b,c?????
		   b = (i > j) + (i > k);
		   c = (k > j) + (j > i);
		   if ((i > j && j > k && a < b && b < c) || (i> k && k> j && a < c && c < b) || (j> i && i> k && b < a && a < c) || (j> k && k> i && b < c && c < a) || (k> i && i> j && c < a && a < b) || (k> j && j> i && c < b && b < a))
		   {
		   //???????? 
				  out = tangible.StringFunctions.changeCharacter(out, i, 'A'); //??????
			  out = tangible.StringFunctions.changeCharacter(out, j, 'B');
			  out = tangible.StringFunctions.changeCharacter(out, k, 'C');
				for (l = 1;l <= 3;l++) //??????
				{
				   System.out.print(out.charAt(l));
				}
		   }
		}
	  }
	}

	return 0;
	}

}

