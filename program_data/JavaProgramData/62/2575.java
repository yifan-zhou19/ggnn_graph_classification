package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String pSource = new String(new char[100]);
	   pSource = new Scanner(System.in).nextLine();

	char[] arrSentence = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	int i = 0;
	int j = 0;
	int nSpace = 0;
	while (pSource.charAt(i) != 0)
	{
	 if (nSpace < 1)
	 {
	  arrSentence[j++] = pSource.charAt(i);
	 }
	 if (pSource.charAt(i) == ' ')
	 {
	  nSpace++;
	  if (pSource.charAt(i + 1) != ' ')
	  {
	   nSpace = 0;
	  }
	 }
	 i++;
	}
	System.out.printf("%s\n",arrSentence);
	return 0;
	}
}
