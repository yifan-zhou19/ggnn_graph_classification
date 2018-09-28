package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String string = new String(new char[LIU + 1]);
		  String substring = new String(new char[LIU + 1]);
		  String replacement = new String(new char[LIU + 1]);
		  String out = new String(new char[LIU + 1]);
		  int h;
		  int i;
		  int j;
		  int k;
		  int n;
		  int l;
		  int lsub;
		  int lreplace;
		  int count;
		  int heihei = 0;
		  String = new Scanner(System.in).nextLine();
		  substring = new Scanner(System.in).nextLine();
		  replacement = new Scanner(System.in).nextLine();
		  l = String.length();
		  lsub = substring.length();
		  lreplace = replacement.length();
		  for (i = 0,n = 0;i < l;i++,n++)
		  {
				  count = 0;
				  for (j = 0;(j < lsub) && (heihei == 0) && (String[i + lsub - 1] != '\0');j++)
				  {
							  if (String[i + j] == substring.charAt(j))
							  {
							  count++;
							  }
				  }
				  if (count == lsub)
				  {
							  heihei = 1;
							  for (k = 0;k < lreplace;k++,n++)
							  {
									 out = tangible.StringFunctions.changeCharacter(out, n, replacement.charAt(k));
							  }
							  i = i + lsub - 1;
							  n--;
				  }
				  else
				  {
				  out = tangible.StringFunctions.changeCharacter(out, n, string.charAt(i));
				  }
		  }
		  out = tangible.StringFunctions.changeCharacter(out, l + lreplace - lsub, '\0');
		  System.out.printf("%s\n",out);
		  System.in.read();
		  System.in.read();
		  return 0;
	}

}

