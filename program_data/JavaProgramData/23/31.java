package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String a = new String(new char[1000]);
	 String c = new String(new char[1000]);
	 int i;
	 int j = 1;
	 int k;
	 int[] b = new int[1000];
	 int len;
	 a = new Scanner(System.in).nextLine();
	 len = a.length();
	 for (i = a.length() - 1;i >= 0;i--)
	 {
	  a = tangible.StringFunctions.changeCharacter(a, i + 1, a.charAt(i));
	 }
	 for (i = 1;i <= len;i++)
	 {
	  if (a.charAt(i) == ' ')
	  {
		   b[j] = i;
		   j++;
	  }
	 }
	 b[j] = len + 1;
	 //printf("%d",j);
	 for (i = 1;i <= j;i++)
	 {
	  for (k = b[i - 1] + 1;k <= b[i] - 1;k++)
	  {
	   c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(b[i - 1] + b[i] - k));
	   //printf("%d %d\n",k,b[i-1]+b[i]-k);
	  }
	 }
	 for (i = 0;i <= j;i++)
	 {
	  c = tangible.StringFunctions.changeCharacter(c, b[i], ' ');
	 }
	 for (i = len;i >= 1;i--)
	 {
	  System.out.printf("%c",c.charAt(i));
	 }
	}

}

