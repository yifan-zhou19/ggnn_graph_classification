package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'str', so pointers on this parameter are left unchanged:
	public static int identf(char * str)
	{
	 int flag = 0;
	 String p = str;
	 if ((*str >= 'a' && *str <= 'z') || (*str >= 'A' && *str <= 'Z') || *str == '_')
	 {
	  flag = 1;
	  str = str.Substring(1);
	 }
	 while (*str && flag != 0)
	 {
	  if ((*str >= 'a' && *str <= 'z') || (*str >= 'A' && *str <= 'Z') || *str == '_' || (*str >= '0' && *str <= '9'))
	  {
	   flag = 1;
	   str = str.Substring(1);
	  }
	  else
	  {
	   flag = 0;
	  }
	 }
	 if (flag != 0)
	 {
  tangible.RefObject<String> tempRef_p = new tangible.RefObject<String>(p);
	  flag = isKey(tempRef_p);
	  p = tempRef_p.argValue;
	 }
	 return flag;
	}
	public static int isKey(tangible.RefObject<String> str)
	{
	 String[] keyword = {"auto", "break", "case", "char", "const", "continue", "default", "do", "double", "else", "enum", "extern", "float", "for", "goto", "if", "int", "long", "register", "return", "short", "signed", "sizeof", "static", "struct", "switch", "typedef", "union", "unsigned", "void", "volatile", "while"};
	 int i;
	 int flag = 1;

	 for (i = 0; i < 32; i++)
	 {
	  if (x_strcmp(str.argValue, keyword[i]) == 0)
	  {
	   flag = 0;
	   break;
	  }
	 }

	 return flag;
	}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'si', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'di', so pointers on this parameter are left unchanged:
	public static int x_strcmp(char * si, char * di)
	{
	 while (*si && *di && *si == *di)
	 {
	  si = si.Substring(1);
	  di = di.Substring(1);
	 }
	 return *si - *di;
	}

	public static int Main()
	{
	 String buffer = new String(new char[256]);
	 int n;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 buffer = new Scanner(System.in).nextLine();
	 for (i = 0;i < n;i++)
	 {
	 buffer = new Scanner(System.in).nextLine();
	 if (identf(buffer) != 0)
	 {
	  System.out.println("1");
	 }
	 else
	 {
	  System.out.println("0");
	 }
	 }
	 return 0;
	}
}

