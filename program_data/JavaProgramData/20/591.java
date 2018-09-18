package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int x = 0;
	   int i;
	   String s1 = new String(new char[100]);
	   String s2 = new String(new char[100]);
	   String s3 = new String(new char[100]);
	   String s4 = new String(new char[100]);
	   while (scanf("%s %s",s1,s2) != EOF)
	   {
			char max = '0';
			int maxi = 0;
			int len1 = s1.length();
		  //  printf("%s\n",s1);
		  //  printf("%d\n",len1);
			for (i = 0;i < len1;i++)
			{
				if (s1.charAt(i) > max)
				{
					max = s1.charAt(i);
					maxi = i;
				}
			}
			s3 = s1;
		   // printf("%s\n",s3);
			s3 = tangible.StringFunctions.changeCharacter(s3, maxi + 1, '\0');
			s3 += s2;
		  //  printf("%s\n",s3);
			s4 = tangible.StringFunctions.changeCharacter(s4, 0, '\0');
			for (i = maxi + 1;i <= len1;i++)
			{
				s4 = tangible.StringFunctions.changeCharacter(s4, i - maxi, s4.charAt(i - maxi - 1));
				s4 = tangible.StringFunctions.changeCharacter(s4, i - maxi - 1, s1.charAt(i));
			}
		  //  printf("%s\n",s4);
			s3 += s4;
			System.out.printf("%s\n",s3);
	   }
	}
}

