package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String str = new String(new char[500]);
	 char c;
	 final String p = "";
	 int i = 0;
	 int j = 0;
	 int max = 0;
	 int min = 50;
	 int l1 = 0;
	 int l2 = 0;
		str = new Scanner(System.in).nextLine();
	 do
	 {
	  c = str.charAt(i);
	  if (c == ' ' || c == '\0')
	  {
	   if (j < min)
	   {
		   min = j;
		   l2 = i - j;
	   }
	   if (j > max)
	   {
		   max = j;
		   l1 = i - j;
	   }
	   j = 0;
	  }
	  else
	  {
	   j++;
	  }
	  i++;
	 }while (c != '\0');
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
	 memcpy(p,str.Substring(l1),max);
	 System.out.printf("%s\n",p);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
	 memcpy(p,"",50);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
	 memcpy(p,str.Substring(l2),min);
	 System.out.printf("%s\n",p);
	 return 0;
	}

}
