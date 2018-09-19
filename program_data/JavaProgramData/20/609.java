package <missing>;

public class GlobalMembers
{
	public static void function(tangible.RefObject<String> str, tangible.RefObject<String> substr)
	{
	 int i;
	 int max;
	 int position;
	 for (i = 1,max = str.argValue.charAt(0),position = 0;str.argValue.charAt(i) != '\0';i++)
	 {
		 if (str.argValue.charAt(i) > max)
		 {
			max = str.argValue.charAt(i);
			position = i;
		 }
	 }
	 str.argValue.charAt(i + 3) = '\0';
	 for (i -= 1;i > position;i--)
	 {
		 str.argValue.charAt(i + 3) = str.argValue.charAt(i);
	 }
	 str.argValue.charAt(position + 1) = substr.argValue.charAt(0);
	 str.argValue.charAt(position + 2) = substr.argValue.charAt(1);
	 str.argValue.charAt(position + 3) = substr.argValue.charAt(2);
	}

	public static int Main()
	{
		String str = new String(new char[15]);
		String substr = new String(new char[4]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			substr = tempVar2.charAt(0);
		}
	  while (System.in.read() != EOF)
	  {
	 tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
	 tangible.RefObject<String> tempRef_substr = new tangible.RefObject<String>(substr);
		 function(tempRef_str, tempRef_substr);
		 substr = tempRef_substr.argValue;
		 str = tempRef_str.argValue;
		 System.out.printf("%s\n",str);
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 str = tempVar3.charAt(0);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 substr = tempVar4.charAt(0);
		 }
	  }
		return 1;
	}


}

