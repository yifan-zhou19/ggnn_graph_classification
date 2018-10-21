package <missing>;

public class GlobalMembers
{
	public static void turn(tangible.RefObject<String> a)
	{
	 char[][] b = new char[100][200];
	 final String c = "";
	 int i;
	 int j = 0;
	 int k;
	 int l;
	 for (i = 0;a.argValue.charAt(i);i++)
	 {
	  if (a.argValue.charAt(i) == ' ')
	  {
	   k = i;
	   while (a.argValue.charAt(k - 1) != ' ' && k != 0)
	   {
		k--;
	   }
	   for (l = 0;k < i;k++,l++)
	   {
		b[j][l] = a.argValue.charAt(k);
	   }
	   b[j][l] = '\0';
	   j++;
	  }
	 }
			 k = i;
	   while (a.argValue.charAt(k - 1) != ' ' && k != 0)
	   {
		k--;
	   }
	   for (l = 0;k < i;k++,l++)
	   {
		b[j][l] = a.argValue.charAt(k);
	   }
	   b[j][l] = '\0';
	   j++;
	  a.argValue = c;
	  for (i = j - 1;i >= 0;i--)
	  {
	   a.argValue += b[i];
	   a.argValue += " ";
	   if (i == 0)
	   {
		a.argValue += "\0";
	   }
	  }
	}
	public static void Main()
	{
		int r;
		String a = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
		r = a.length();
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		turn(tempRef_a);
		a = tempRef_a.argValue;
		a = a.substring(0, r);
		System.out.println(a);
	}
}

