package <missing>;

public class GlobalMembers
{
	/*
	 * 3.cpp
	 *
	 *  Created on: 2013-11-22
	 *      Author: Administrator
	 */

	/*#include<iostream>
	void change(char a[300])//??????????
	{
		int q;
		for(int i=0;i<strlen(a)/2;i++)
		{
			if(strlen(a)-i-1==i)break;
			else{
				q=a[i];
			a[i]=a[strlen(a)-i-1];
			a[strlen(a)-i-1]=q;
			}
		}
	}
	int max1(char c[300],char b[300])//????????
	{
		if(strlen(c)>strlen(b))return strlen(c);
		else return strlen(b);
	}
	
	int add(char c[300],char d[300],int x,char s[300])//???????????
	{
		if(c[x]-'0'+d[x]-'0'<10)
		{
			s[x]=c[x]-'0'+d[x]-'0';
			if(x==max1(c,d)-1)return 0; //??????????
		}
		else
		{
			s[x]=c[x]-'0'+d[x]-'0'-10;//????????
			c[x+1]++;
			if(x==max1(c,d))return 0;
		}
		return add(c,d,x+1,s);
	}
	void happy(int s[300])
	{
		for(int i=0;i<300;i++)
		{
			s[i]='0';
		}
	}
	int main()
	{
		char a[300]={'0'};
		char b[300]={'0'};
		char c[300]={'0'};
		happy(a);
		happy(b);
		happy(c);
		cin>>a>>b;
		change(a);
		change(b);
		add(a,b,0,c);
		if(c[max1(a,b)]!='0')cout<<'1';//??????
		for(int i=max1(a,b)-1;i>=0;i--)//?c????
			{
				cout<<char(c[i]+'0');
			}
	}*/
	/*#include<iostream>
	int lenA,lenB,maxlen;
	void change(char a[300],int len)
	{
		char q;
		for(int i=0;i<len/2;i++)
		{
			if(len-i-1==i)break;
			else{
				q=a[i];
				a[i]=a[len-i-1];
				a[len-i-1]=q;
			}
		}
	
	}
	int add(char c[300],char d[300],int x,char s[300])
	{
		if(c[x]-'0'+d[x]-'0'<10)
		{
			s[x]=c[x]+d[x]-'0';
			if(x>maxlen)return 0;
	
		}
		else{
			s[x]=c[x]-'0'+d[x]-10;
			c[x+1]++;
			if(x>=maxlen-1)
			{
				s[x+1]++;
			maxlen++;
			return 0;
			}
		}
		return add(c,d,x+1,s);
	}
	void happy(char s[300])
	{
		for(int i=0;i<300;i++)
		{
			s[i]='0';
		}
	}
	int main()
	{
		char a[300]={'0'};
		char b[300]={'0'};
		char c[300]={'0'};
	
	happy(a);
	happy(b);
	happy(c);
	cin>>a>>b;
	lenA=strlen(a);
	lenB=strlen(b);
	maxlen=lenA>lenB?lenA:lenB;
	cout<<maxlen<<endl;
	a[lenA]=b[lenB]='0';
	change(a,lenA);
	change(b,lenB);
	add(a,b,0,c);
	for(int i=maxlen-1;i>=0;i--)
	{
		cout<<c[i];
	}
	 return 0;
	}
	?????*/

	public static int lenA;
	public static int lenB;
	public static int maxLen;
	public static void change(String a, int len) //??????????
	{
		int q;
		for (int i = 0;i < len / 2;i++)
		{
			if (len - i - 1 == i)
			{
				break;
			}
			else
			{
				q = a[i];
			a[i] = a[len - i - 1];
			a[len - i - 1] = q;

			}
		}
	}

	public static int add(String c, String d, int x, String s) //???????????
	{
		if (c[x] - '0' + d[x] - '0' < 10 != null)
		{
			s[x] = c[x] - '0' + d[x];
			if (x >= maxLen - 1)
			{
				return 0; //??????????
			}
		}
		else
		{
			s[x] = c[x] - '0' + d[x] - 10; //????????
			c[x + 1] = c[x + 1].Substring(1);
			if (x >= maxLen - 1)
			{
				s[x + 1] = s[x + 1].Substring(1);
				maxLen++;
				return 0;
			}
		}
		return add(c, d, x + 1, s);
	}
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		int i;
		int j;
		for (i = 0; i < 300; i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, b[i] = c[i] = '0');
		}
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; a.charAt(i) != '\0' && a.charAt(i) == '0'; i++)
		{
			;
		}
		lenA = a.length();
		for (j = 0; j < lenA - i; j++)
		{
			a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + i));
		}
		lenA -= i;
		for (i = 0; b.charAt(i) != '\0' && b.charAt(i) == '0'; i++)
		{
			;
		}
		lenB = b.length();
		for (j = 0; j < lenB - i; j++)
		{
			b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + i));
		}
		lenB -= i;
		if (lenA == 0 && lenB == 0)
		{
			System.out.print('0');
		}
		else if (lenA == 0)
		{
			System.out.print(b);
		}
		else if (lenB == 0)
		{
			System.out.print(a);
		}
		else
		{
			maxLen = lenA > lenB != 0 ? lenA : lenB;
			a = tangible.StringFunctions.changeCharacter(a, lenA, b[lenB] = '0');
			change(a, lenA);
			change(b, lenB);
			add(a, b, 0, c);
			for (i = maxLen - 1;i >= 0;i--) //?c????
			{
					//if (i != 0)
					//	continue;
					System.out.print(c.charAt(i));
			}
		}
	}


}

