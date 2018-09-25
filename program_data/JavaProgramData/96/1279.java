package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int l;
		  int m;
		  int n;
		  int tem;
		  String num = new String(new char[100]);
		  String res = new String(new char[100]);
		  for (i = 0;i < 100;i++)
		  {
			  res = tangible.StringFunctions.changeCharacter(res, i, '\0');
		  }
		  num = new Scanner(System.in).nextLine();
		  tem = num.charAt(0) - '0';
		  res = tangible.StringFunctions.changeCharacter(res, 0, '0');
		  l = num.length();
		  for (i = 1;i < l;i++)
		  {
						  tem = tem * 10 + (num.charAt(i) - '0');
						  res = tangible.StringFunctions.changeCharacter(res, i - 1, tem / 13 + '0');
						  tem = tem % 13;
		  }
		  if (res.length() != 1 && res.charAt(0) == '0')
		  {
										 for (i = 0;i < l;i++)
										 {
										 res = tangible.StringFunctions.changeCharacter(res, i, res.charAt(i + 1));
										 }
		  }
		  System.out.printf("%s\n",res);
		  System.out.printf("%d",tem);
	}

}

