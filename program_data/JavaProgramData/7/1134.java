int strnl = new int(char *,char *);
void replace(char * str,int len_ss,int start,char * rpl);

int main()
{
	String str = new String(new char[256]);
	String substr = new String(new char[256]);
	String rpl = new String(new char[256]);
	int start;
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
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		rpl = tempVar3.charAt(0);
	}
	start = tangible.StringFunctions.strStr(str,substr);
	if (start != 0)
	{
		replace(str,substr.length(),(String)start - str,rpl);
	}
		  else
		  {
			   System.out.printf("%s\n",str);
		  }
	return 0;
}

int isstart(int i,char * s,char * subs)
{
	String temp = new String(new char[256]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * pt;
	p = s + i;
	pt = temp;
	int j;
	for (j = 0;j < subs.length();j++)
	{
		*pt++=*p++;
	}
	*pt = 0;
	if (!strcmp(temp,subs))
	{
		return 1;
	}
	return 0;
}

int strnl(char * s,char * subs)
{
	int i;
	for (i = 0;i <= s.length() - subs.length();i++)
	{
		if (isstart(i,s,subs))
		{
			return i;
		}
	}
	return -1;
}

void replace(char * str,int len_ss,int start,char * rpl)
{
	String temp = new String(new char[256]);
	temp = str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * ptmp;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * prpl;
	ptmp = temp + start;
	prpl = rpl;
	while (*prpl != null)
	{
		*ptmp++=*prpl++;
	}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * pstr = str + start + len_ss;
	while (*pstr != null)
	{
		*ptmp++=*pstr++;
	}
	*ptmp = 0;
		 str = temp;
	System.out.printf("%s\n",temp);
}


