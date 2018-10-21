package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String s = new String(new char[100]);
	 String a = new String(new char[100]);
	 String b = new String(new char[100]);
	 char[][] zj = new char[100][100];
	 int i = 0;
	 int k;
	 int t = 0;
	 s = new Scanner(System.in).nextLine();
	 a = new Scanner(System.in).nextLine();
	 b = new Scanner(System.in).nextLine();
	 while (s.charAt(i) != '\0')
	 {
		  k = 0;
		  while (s.charAt(i) != ' ' && s.charAt(i) != '\0')
		  {
			   zj[t][k] = s.charAt(i);
			   k++;
			   i++;
		  }
		  zj[t][k] = '\0'; //???????
		  while (s.charAt(i) == ' ')
		  {
			   i++;
		  }
		  t++;
	 }
	  zj[t][k + 1] = '\0';
	 for (i = 0;i < t;i++)
	 {

		  if (strcmp(zj[i],a) == 0)
		  {
					   zj[i] = b;
		  }
	 }
	 for (i = 0;i < t - 1;i++)
	 {
		System.out.printf("%s ",zj[i]);
	 }
	 System.out.printf("%s",zj[i]); //??????
	 return 0;
	}

}
