import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		int len1 = 0; //flag????s????a?1???
		int len2 = 0;
		int len3 = 0;
		int i;
		int j;
		int n = -1;
		int k;
		int flag;
		s = new Scanner(System.in).nextLine(); //??
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		for (len1 = 0;s.charAt(len1) != '\0';len1++)
		{
			; //?len1,len2,len3??s,a,b???
		}
		for (len2 = 0;a.charAt(len2) != '\0';len2++)
		{
			;
		}
		for (len3 = 0;b.charAt(len3) != '\0';len3++)
		{
			;
		}


		for (i = 0;i < len1;i++)
		{
			flag = 0; //??0
			if (((i != 0) && (s.charAt(i) == a.charAt(0)) && (s.charAt(i - 1) == ' ')) || ((i == 0) && (s.charAt(i) == a.charAt(0)))) //??s???????a??,????????????????????(?????),?????
			{
				flag = 1; //flag??1
			  for (j = 1;j < len2;j++)
			  {
			  if (s.charAt(i + j) != a.charAt(j))
			  {
				  flag = 0; //??????a??,flag?0
			  }
			  }
			  if (((i + j) != len1) && (s.charAt(i + j) != ' '))
			  {
				  flag = 0; //???????????????????,?????,??flag=0;
			  }
			}

			 if (flag != 0) //??s??a,?b????????c
			 {
				 k = n + 1;
				 while (n < k + len3 - 1)
				 {
					 n++;
					 c = tangible.StringFunctions.changeCharacter(c, n, b.charAt(n - k));
				 }
				 i = i + len2 - 1; //i??s???a???
			 }
			 else
			 {
				 n++;
				 c = tangible.StringFunctions.changeCharacter(c, n, s.charAt(i));
			 } //??????a,???s????c
		}
		for (i = 0;i <= n;i++)
		{
			System.out.print(c.charAt(i));
		}

		return 0;
	}

}

