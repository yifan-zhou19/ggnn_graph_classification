package <missing>;

public class GlobalMembers
{
	public static int EnStack(tangible.RefObject<String> Stack, int Top, char Letter)
	{
		Stack.argValue.charAt(++Top) = Letter;
		return Top;
	}

	public static int PushAndPop(tangible.RefObject<String> Stack, int Top)
	{
	  while (Top >= 0)
	  {
			System.out.print(Stack.argValue.charAt(Top--));
	  }
	  Stack.argValue.charAt(0) = '\0';
	  return Top;
	}

	public static int IsEmpty(tangible.RefObject<String> Stack)
	{
		return Stack.argValue.charAt(0) == '\0';
	}

	public static int Main()
	{
		int Top = -1;
		final String Stack = "";
		final String Str = "";
		int flag = 0;
		int i;
		Str = new Scanner(System.in).nextLine();
		for (i = Str.length() - 1;i >= 0;i--)
		{
			if (Str.charAt(i) != ' ')
			{
		  tangible.RefObject<String> tempRef_Stack = new tangible.RefObject<String>(Stack);
			  Top = EnStack(tempRef_Stack, Top, Str.charAt(i));
			  Stack = tempRef_Stack.argValue;
			}
		else
		{
			tangible.RefObject<String> tempRef_Stack2 = new tangible.RefObject<String>(Stack);
				if (IsEmpty(tempRef_Stack2) == 0)
				{
					Stack = tempRef_Stack2.argValue;
						if (flag != 0)
						{
						   System.out.print(" ");
						}
						else
						{
							flag = 1;
						}
					tangible.RefObject<String> tempRef_Stack3 = new tangible.RefObject<String>(Stack);
						Top = PushAndPop(tempRef_Stack3, Top);
						Stack = tempRef_Stack3.argValue;
				}
				else
				{
					Stack = tempRef_Stack2.argValue;
				}
		}
		}
	tangible.RefObject<String> tempRef_Stack4 = new tangible.RefObject<String>(Stack);
		if (IsEmpty(tempRef_Stack4) == 0)
		{
			Stack = tempRef_Stack4.argValue;
		   if (flag != 0)
		   {
			 System.out.print(" ");
		   }
	   tangible.RefObject<String> tempRef_Stack5 = new tangible.RefObject<String>(Stack);
		   PushAndPop(tempRef_Stack5, Top);
		   Stack = tempRef_Stack5.argValue;
		}
		else
		{
			Stack = tempRef_Stack4.argValue;
		}
	   return 1;
	}

}

