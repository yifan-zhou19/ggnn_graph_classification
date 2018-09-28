package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String s;
	String w;
	int i;
	int j;
	int flag = 1;
	int lena;
	int lenb;
	int head;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	s = (String)calloc(50,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	w = (String)calloc(50,(Character.SIZE / Byte.SIZE));
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s = tempVar.charAt(0);
	  }
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		lena = s.length();
		lenb = w.length();
	for (i = 0;i < lenb - 1;i++)
	{
		for (j = 0;j < lena - 1;j++)
		{
			if (*(s.Substring(j)) != *(w.Substring(i) + j))
			{
				flag = 0;
			}
		}

			if (flag == 1)
			{
				head = i;
				break;
			}
			flag = 1;
	}
	System.out.printf("%d",head);
	}

}

