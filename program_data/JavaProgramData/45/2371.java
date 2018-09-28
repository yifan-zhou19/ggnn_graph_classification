package <missing>;

public class GlobalMembers
{
	public static int location(tangible.RefObject<String> seg, tangible.RefObject<String> who)
	{
		int i = 0;
		int j;
		int len;
		int flag = 0;
		len = seg.argValue.length();
		for (j = 0;;j++)
		{
			if (who.argValue.charAt(j) == seg.argValue.charAt(i))
			{
				for (;i < len && (who.argValue.charAt(j) == seg.argValue.charAt(i));i++, j++)
				{
					;
				}
				if (i == len && (who.argValue.charAt(j - 1) == seg.argValue.charAt(i - 1)))
				{
					flag = 1;
					break;
				}
			}
		}
		if (flag == 1)
		{
			return j - len;
		}
		else
		{
			return -1;
		}
	}

	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *segment=(char *)malloc(sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char segment = (String)malloc((Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *whole=(char *)malloc(sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char whole = (String)malloc((Character.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			segment = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			whole = tempVar2.charAt(0);
		}
	tangible.RefObject<String> tempRef_segment = new tangible.RefObject<String>(segment);
	tangible.RefObject<String> tempRef_whole = new tangible.RefObject<String>(whole);
		System.out.printf("%d",location(tempRef_segment, tempRef_whole));
		whole = tempRef_whole.argValue;
		segment = tempRef_segment.argValue;
		return 0;
	}


}

