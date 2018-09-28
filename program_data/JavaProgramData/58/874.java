import java.util.*;

/*
 * pandshfwc++hfyy.cpp
 *
 *  Created on: 2011-12-10
 *      Author: q
 */
int judgerr = char * ; //???????????
int main()
{
	int n; //?????????
	int i;
	char[][] a =
	{
		{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	}; //??????????B?????
	(char)(*p)[81];
	String b = new String(new char[10]);
	p = a; //??????
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	b = new Scanner(System.in).nextLine();
	for (i = 0;i < n;i++) //??
	{
		*p = new Scanner(System.in).nextLine();
		p++;
	}
	p = a; //???????
	while (p < (a + n)) //??????????
	{
		int judgement = judgerr(*p);
		System.out.print(judgement);
		System.out.print("\n");
		p++; //????
	}
	return 0;

}
int judgerr(char * p1)
{
	int judger = 1;
	if (*p1 < 65 || (*p1>'Z' && *p1 < 'a' && *p1 != '_') || *p1>'z') //????C++???
	{
		judger = 0;
	}
	else
	{
		p1++; //?????2?
	while (*p1 != '\0')
	{
		if ((*p1 > '9' && *p1 < 64) || (*p1>'Z' && *p1 < 'a' && *p1 != '_') || *p1>'z' || *p1 < '0') //?????
		{
			judger = 0;
			break;
		}
		p1++; //????
	}
	}
	return judger;
}



