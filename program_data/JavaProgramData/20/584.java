package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[15]);
		String s2 = new String(new char[4]);
		String s3 = new String(new char[20]);
		String s4 = new String(new char[20]);
		char max;
		int i;
		int j;
		int k;
		int n1;
		int n2;
		while (scanf("%s%s",s1,s2) != EOF)
		{

			n1 = s1.length();
			n2 = s2.length();

			s3 = " ";
			s4 = " ";
			  max = s1.charAt(0);
			  for (i = 0,k = 0;i < n1;i++)
			  {
				  if (s1.charAt(i) > max)
				  {
					  max = s1.charAt(i);
					  k = i;
				  }
			  }

			  s3 = s1.substring(0, k + 1);
						s3 = tangible.StringFunctions.changeCharacter(s3, k + 1, '\0');
			  s3 += s2;


			  for (i = k + 1,j = 0;s1.charAt(i) != '\0';i++,j++)
			  {
				  s4 = tangible.StringFunctions.changeCharacter(s4, j, s1.charAt(i));
			  }
						s4 = tangible.StringFunctions.changeCharacter(s4, j, '\0');
			  s3 += s4;
			 System.out.printf("%s\n",s3);
		}

	}

}

