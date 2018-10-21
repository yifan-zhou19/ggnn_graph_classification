package <missing>;

public class GlobalMembers
{
	// ??13.cpp : ??????????????
	//



	public static int Main()
	{
		String a = new String(new char[100]); //={"10382942388594365769456845647694"};
		String shang = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int sh;
		int yushu = a.charAt(0) - '0';
		int i;
		//scanf("%s",a);
		if (((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) < 13 && a.charAt(2) == '\0')
		{
			System.out.print("0");
		}
		if (a.charAt(1) == '\0')
		{
			System.out.print("0");
		}
		for (i = 1;a.charAt(i) != '\0';i++)
		{
			sh = (yushu * 10 + (a.charAt(i) - '0')) / 13;
			yushu = (yushu * 10 + (a.charAt(i) - '0')) % 13;
			shang = tangible.StringFunctions.changeCharacter(shang, i - 1, sh);
			if (i != 1 || sh != 0)
			{
				System.out.printf("%d",sh);
			}
		}
		//for(i=0;shang[i]!='\0';i++)
			//printf("%c",shang[i]);
		System.out.printf("\n%d",yushu);

	}


}

