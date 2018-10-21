package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int x = 0;
	 int n1;
	 int n2;
	 int n;
	 String a = new String(new char[80]);
	 String b = new String(new char[80]);
	 a = new Scanner(System.in).nextLine();
	 b = new Scanner(System.in).nextLine();
	 n1 = a.length();
	 n2 = b.length();
	 if (n1 <= n2)
	 {
		 n = n2;
	 }
	 else
	 {
		 n = n1; //??????????
	 }
	 for (i = 0;i < n;i++)
	 {
		 if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
		 {
				 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
		 }
		 if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
		 {
			 b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
		 }
	 } /*????????????????????????????????
	      ????????????????*/ 
	 for (i = 0;i < n;i++)
	 {
	  if (a.charAt(i) == b.charAt(i)) //??||(a[i]==b[i]+32)||(b[i]==a[i]+32))
	  {
	  x = x + 1;
	  }
	  else
	  {
	  if (a.charAt(i) > b.charAt(i))
	  {
		System.out.print(">");
		break;
	  }
	  else
	  {
	  if (a.charAt(i) < b.charAt(i))
	  {
		System.out.print("<");
		break;
	  }
	  }
	  }
	 }
	 if (x == n)
	 {
	 System.out.print("=");
	 }
	}

}

